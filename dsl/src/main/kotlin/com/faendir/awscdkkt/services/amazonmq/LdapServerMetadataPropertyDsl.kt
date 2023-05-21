package com.faendir.awscdkkt.services.amazonmq

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker

@Generated
public
    fun ldapServerMetadataProperty(initializer: CfnBroker.LdapServerMetadataProperty.Builder.() -> Unit
    = {}): CfnBroker.LdapServerMetadataProperty =
    CfnBroker.LdapServerMetadataProperty.builder().apply(initializer).build()
