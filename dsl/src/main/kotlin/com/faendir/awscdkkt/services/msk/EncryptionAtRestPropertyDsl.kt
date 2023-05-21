package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun encryptionAtRestProperty(initializer: CfnCluster.EncryptionAtRestProperty.Builder.() -> Unit
    = {}): CfnCluster.EncryptionAtRestProperty =
    CfnCluster.EncryptionAtRestProperty.builder().apply(initializer).build()
