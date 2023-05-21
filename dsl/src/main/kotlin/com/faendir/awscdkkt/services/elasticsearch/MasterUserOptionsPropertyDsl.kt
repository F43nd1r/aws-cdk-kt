package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

@Generated
public
    fun masterUserOptionsProperty(initializer: CfnDomain.MasterUserOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.MasterUserOptionsProperty =
    CfnDomain.MasterUserOptionsProperty.builder().apply(initializer).build()
