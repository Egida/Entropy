package xyz.terrifictable.entropy.feature

import xyz.terrifictable.entropy.extensions.Extension
import xyz.terrifictable.entropy.feature.features.TestFeature

class FeatureManager {

    val features: ArrayList<Feature> = ArrayList()

    init {

        addFeature(TestFeature())

        Extension.featuresLoad()

    }


    fun addFeature(feature: Feature) {
        this.features.add(feature)
    }

}

