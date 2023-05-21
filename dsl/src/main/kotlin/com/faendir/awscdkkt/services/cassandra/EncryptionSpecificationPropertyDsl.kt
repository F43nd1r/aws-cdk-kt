package com.faendir.awscdkkt.services.cassandra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnTable

@Generated
public
    fun encryptionSpecificationProperty(initializer: CfnTable.EncryptionSpecificationProperty.Builder.() -> Unit
    = {}): CfnTable.EncryptionSpecificationProperty =
    CfnTable.EncryptionSpecificationProperty.builder().apply(initializer).build()
