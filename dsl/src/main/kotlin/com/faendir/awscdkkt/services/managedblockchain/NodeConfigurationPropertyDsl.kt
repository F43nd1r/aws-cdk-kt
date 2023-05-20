@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.managedblockchain

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnNode

public
    fun nodeConfigurationProperty(initializer: CfnNode.NodeConfigurationProperty.Builder.() -> Unit):
    CfnNode.NodeConfigurationProperty =
    CfnNode.NodeConfigurationProperty.builder().apply(initializer).build()
