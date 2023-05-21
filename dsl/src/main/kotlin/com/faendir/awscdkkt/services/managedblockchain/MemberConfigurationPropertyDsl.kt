package com.faendir.awscdkkt.services.managedblockchain

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnMember

@Generated
public
    fun memberConfigurationProperty(initializer: CfnMember.MemberConfigurationProperty.Builder.() -> Unit
    = {}): CfnMember.MemberConfigurationProperty =
    CfnMember.MemberConfigurationProperty.builder().apply(initializer).build()
