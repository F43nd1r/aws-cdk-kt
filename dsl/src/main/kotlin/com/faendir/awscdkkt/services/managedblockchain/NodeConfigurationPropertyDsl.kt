@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.managedblockchain

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnNode

public
    fun nodeConfigurationProperty(initializer: CfnNode.NodeConfigurationProperty.Builder.() -> Unit):
    CfnNode.NodeConfigurationProperty =
    CfnNode.NodeConfigurationProperty.builder().apply(initializer).build()
