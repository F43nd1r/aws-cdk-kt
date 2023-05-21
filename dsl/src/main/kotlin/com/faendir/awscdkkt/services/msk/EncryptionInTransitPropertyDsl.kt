package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnCluster

@Generated
public
    fun encryptionInTransitProperty(initializer: CfnCluster.EncryptionInTransitProperty.Builder.() -> Unit
    = {}): CfnCluster.EncryptionInTransitProperty =
    CfnCluster.EncryptionInTransitProperty.builder().apply(initializer).build()
