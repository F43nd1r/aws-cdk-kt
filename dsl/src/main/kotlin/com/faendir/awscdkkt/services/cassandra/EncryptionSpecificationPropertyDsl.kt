@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

public
    fun encryptionSpecificationProperty(initializer: CfnTable.EncryptionSpecificationProperty.Builder.() -> Unit):
    CfnTable.EncryptionSpecificationProperty =
    CfnTable.EncryptionSpecificationProperty.builder().apply(initializer).build()
