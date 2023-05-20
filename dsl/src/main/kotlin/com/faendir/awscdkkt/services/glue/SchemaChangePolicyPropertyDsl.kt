@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

public
    fun schemaChangePolicyProperty(initializer: CfnCrawler.SchemaChangePolicyProperty.Builder.() -> Unit):
    CfnCrawler.SchemaChangePolicyProperty =
    CfnCrawler.SchemaChangePolicyProperty.builder().apply(initializer).build()
