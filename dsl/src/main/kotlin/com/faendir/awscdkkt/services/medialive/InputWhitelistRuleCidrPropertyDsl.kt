package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnInputSecurityGroup

@Generated
public
    fun inputWhitelistRuleCidrProperty(initializer: CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.Builder.() -> Unit
    = {}): CfnInputSecurityGroup.InputWhitelistRuleCidrProperty =
    CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.builder().apply(initializer).build()
