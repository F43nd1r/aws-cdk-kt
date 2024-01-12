package com.faendir.awscdkkt.generated.services.codetest

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codetest.CfnSeries
import software.amazon.awscdk.services.codetest.CfnSeriesProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSeries(
  id: String,
  props: CfnSeriesProps,
  initializer: @AwsCdkDsl CfnSeries.() -> Unit = {},
): CfnSeries = CfnSeries(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSeries(id: String, initializer: @AwsCdkDsl CfnSeries.Builder.() -> Unit
    = {}): CfnSeries = CfnSeries.Builder.create(this, id).apply(initializer).build()
