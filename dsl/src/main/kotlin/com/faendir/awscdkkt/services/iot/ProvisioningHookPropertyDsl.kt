package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate

@Generated
public
    fun provisioningHookProperty(initializer: CfnProvisioningTemplate.ProvisioningHookProperty.Builder.() -> Unit
    = {}): CfnProvisioningTemplate.ProvisioningHookProperty =
    CfnProvisioningTemplate.ProvisioningHookProperty.builder().apply(initializer).build()
