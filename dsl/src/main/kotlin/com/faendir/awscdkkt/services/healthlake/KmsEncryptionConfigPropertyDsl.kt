@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.healthlake

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

public
    fun kmsEncryptionConfigProperty(initializer: CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder.() -> Unit):
    CfnFHIRDatastore.KmsEncryptionConfigProperty =
    CfnFHIRDatastore.KmsEncryptionConfigProperty.builder().apply(initializer).build()
