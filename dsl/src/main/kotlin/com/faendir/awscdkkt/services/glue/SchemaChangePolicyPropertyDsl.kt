@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

public
    fun schemaChangePolicyProperty(initializer: CfnCrawler.SchemaChangePolicyProperty.Builder.() -> Unit):
    CfnCrawler.SchemaChangePolicyProperty =
    CfnCrawler.SchemaChangePolicyProperty.builder().apply(initializer).build()
