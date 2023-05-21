package com.faendir.awscdkkt.services.healthlake

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

@Generated
public
    fun kmsEncryptionConfigProperty(initializer: CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder.() -> Unit
    = {}): CfnFHIRDatastore.KmsEncryptionConfigProperty =
    CfnFHIRDatastore.KmsEncryptionConfigProperty.builder().apply(initializer).build()
