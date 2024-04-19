package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnInsight
import software.amazon.awscdk.services.securityhub.CfnInsightProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInsight(
  id: String,
  props: CfnInsightProps,
  initializer: @AwsCdkDsl CfnInsight.() -> Unit = {},
): CfnInsight = CfnInsight(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInsight(id: String, initializer: @AwsCdkDsl
    CfnInsight.Builder.() -> Unit = {}): CfnInsight = CfnInsight.Builder.create(this,
    id).apply(initializer).build()
