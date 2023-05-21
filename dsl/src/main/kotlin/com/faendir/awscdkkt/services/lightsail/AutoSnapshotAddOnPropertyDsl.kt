package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnInstance

@Generated
public
    fun autoSnapshotAddOnProperty(initializer: CfnInstance.AutoSnapshotAddOnProperty.Builder.() -> Unit
    = {}): CfnInstance.AutoSnapshotAddOnProperty =
    CfnInstance.AutoSnapshotAddOnProperty.builder().apply(initializer).build()
