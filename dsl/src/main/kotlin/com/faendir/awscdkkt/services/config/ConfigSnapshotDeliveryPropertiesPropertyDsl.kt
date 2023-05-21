package com.faendir.awscdkkt.services.config

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnDeliveryChannel

@Generated
public
    fun configSnapshotDeliveryPropertiesProperty(initializer: CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.Builder.() -> Unit
    = {}): CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty =
    CfnDeliveryChannel.ConfigSnapshotDeliveryPropertiesProperty.builder().apply(initializer).build()
