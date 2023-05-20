@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

public
    fun encryptionConfigProperty(initializer: CfnCluster.EncryptionConfigProperty.Builder.() -> Unit):
    CfnCluster.EncryptionConfigProperty =
    CfnCluster.EncryptionConfigProperty.builder().apply(initializer).build()
