package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun buildTargetsProperty(initializer: @AwsCdkDsl
    CfnCrawler.TargetsProperty.Builder.() -> Unit = {}): CfnCrawler.TargetsProperty =
    CfnCrawler.TargetsProperty.Builder().apply(initializer).build()
