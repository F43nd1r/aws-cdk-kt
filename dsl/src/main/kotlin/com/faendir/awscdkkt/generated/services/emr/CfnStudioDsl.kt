package com.faendir.awscdkkt.generated.services.emr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnStudio
import software.amazon.awscdk.services.emr.CfnStudioProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStudio(
  id: String,
  props: CfnStudioProps,
  initializer: @AwsCdkDsl CfnStudio.() -> Unit = {},
): CfnStudio = CfnStudio(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStudio(id: String, initializer: @AwsCdkDsl CfnStudio.Builder.() -> Unit = {}): CfnStudio = CfnStudio.Builder.create(this, id).apply(initializer).build()
