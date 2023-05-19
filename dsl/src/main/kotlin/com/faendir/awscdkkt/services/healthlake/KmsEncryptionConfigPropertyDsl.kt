@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.healthlake

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.healthlake.CfnFHIRDatastore

public
    fun kmsEncryptionConfigProperty(initializer: CfnFHIRDatastore.KmsEncryptionConfigProperty.Builder.() -> Unit):
    CfnFHIRDatastore.KmsEncryptionConfigProperty =
    CfnFHIRDatastore.KmsEncryptionConfigProperty.builder().apply(initializer).build()
