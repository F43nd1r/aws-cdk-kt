@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

public
    fun encryptionSpecificationProperty(initializer: CfnTable.EncryptionSpecificationProperty.Builder.() -> Unit):
    CfnTable.EncryptionSpecificationProperty =
    CfnTable.EncryptionSpecificationProperty.builder().apply(initializer).build()
