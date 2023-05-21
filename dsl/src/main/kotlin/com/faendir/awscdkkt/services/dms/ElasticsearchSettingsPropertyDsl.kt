package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint

@Generated
public
    fun elasticsearchSettingsProperty(initializer: CfnEndpoint.ElasticsearchSettingsProperty.Builder.() -> Unit
    = {}): CfnEndpoint.ElasticsearchSettingsProperty =
    CfnEndpoint.ElasticsearchSettingsProperty.builder().apply(initializer).build()
