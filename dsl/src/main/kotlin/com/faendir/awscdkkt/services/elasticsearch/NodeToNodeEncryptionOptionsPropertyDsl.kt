package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@Generated
public
    fun nodeToNodeEncryptionOptionsProperty(initializer: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.NodeToNodeEncryptionOptionsProperty =
    CfnDomain.NodeToNodeEncryptionOptionsProperty.builder().apply(initializer).build()
