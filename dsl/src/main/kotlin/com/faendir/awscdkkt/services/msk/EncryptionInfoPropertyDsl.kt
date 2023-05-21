package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public fun encryptionInfoProperty(initializer: CfnCluster.EncryptionInfoProperty.Builder.() -> Unit
    = {}): CfnCluster.EncryptionInfoProperty =
    CfnCluster.EncryptionInfoProperty.builder().apply(initializer).build()
