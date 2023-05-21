package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public
    fun nodeToNodeEncryptionOptionsProperty(initializer: CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.NodeToNodeEncryptionOptionsProperty =
    CfnDomain.NodeToNodeEncryptionOptionsProperty.builder().apply(initializer).build()
