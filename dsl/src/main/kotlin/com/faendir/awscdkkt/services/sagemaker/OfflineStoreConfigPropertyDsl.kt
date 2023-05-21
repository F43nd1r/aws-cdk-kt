package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnFeatureGroup

@Generated
public
    fun offlineStoreConfigProperty(initializer: CfnFeatureGroup.OfflineStoreConfigProperty.Builder.() -> Unit
    = {}): CfnFeatureGroup.OfflineStoreConfigProperty =
    CfnFeatureGroup.OfflineStoreConfigProperty.builder().apply(initializer).build()
