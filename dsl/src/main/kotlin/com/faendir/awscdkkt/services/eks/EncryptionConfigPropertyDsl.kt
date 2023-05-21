package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public
    fun encryptionConfigProperty(initializer: CfnCluster.EncryptionConfigProperty.Builder.() -> Unit
    = {}): CfnCluster.EncryptionConfigProperty =
    CfnCluster.EncryptionConfigProperty.builder().apply(initializer).build()
