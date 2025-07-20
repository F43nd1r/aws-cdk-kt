package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerIngressPoint
import software.amazon.awscdk.services.ses.CfnMailManagerIngressPointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMailManagerIngressPoint(
  id: String,
  props: CfnMailManagerIngressPointProps,
  initializer: @AwsCdkDsl CfnMailManagerIngressPoint.() -> Unit = {},
): CfnMailManagerIngressPoint = CfnMailManagerIngressPoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMailManagerIngressPoint(id: String, initializer: @AwsCdkDsl CfnMailManagerIngressPoint.Builder.() -> Unit = {}): CfnMailManagerIngressPoint = CfnMailManagerIngressPoint.Builder.create(this, id).apply(initializer).build()
