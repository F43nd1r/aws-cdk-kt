package com.faendir.awscdkkt.services.devopsguru

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.devopsguru.CfnResourceCollection

@Generated
public
    fun tagCollectionProperty(initializer: CfnResourceCollection.TagCollectionProperty.Builder.() -> Unit
    = {}): CfnResourceCollection.TagCollectionProperty =
    CfnResourceCollection.TagCollectionProperty.builder().apply(initializer).build()
