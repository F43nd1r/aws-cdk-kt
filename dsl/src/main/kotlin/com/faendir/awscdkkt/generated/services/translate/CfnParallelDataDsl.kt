package com.faendir.awscdkkt.generated.services.translate

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.translate.CfnParallelData
import software.amazon.awscdk.services.translate.CfnParallelDataProps
import software.constructs.Construct

@Generated
public fun Construct.cfnParallelData(
  id: String,
  props: CfnParallelDataProps,
  initializer: @AwsCdkDsl CfnParallelData.() -> Unit = {},
): CfnParallelData = CfnParallelData(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnParallelData(id: String, initializer: @AwsCdkDsl CfnParallelData.Builder.() -> Unit = {}): CfnParallelData = CfnParallelData.Builder.create(this, id).apply(initializer).build()
