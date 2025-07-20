package com.faendir.awscdkkt.generated.services.aps

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnScraper
import software.amazon.awscdk.services.aps.CfnScraperProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScraper(
  id: String,
  props: CfnScraperProps,
  initializer: @AwsCdkDsl CfnScraper.() -> Unit = {},
): CfnScraper = CfnScraper(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScraper(id: String, initializer: @AwsCdkDsl CfnScraper.Builder.() -> Unit = {}): CfnScraper = CfnScraper.Builder.create(this, id).apply(initializer).build()
