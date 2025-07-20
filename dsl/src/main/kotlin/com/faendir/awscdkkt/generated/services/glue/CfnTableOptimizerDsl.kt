package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTableOptimizer
import software.amazon.awscdk.services.glue.CfnTableOptimizerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTableOptimizer(
  id: String,
  props: CfnTableOptimizerProps,
  initializer: @AwsCdkDsl CfnTableOptimizer.() -> Unit = {},
): CfnTableOptimizer = CfnTableOptimizer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTableOptimizer(id: String, initializer: @AwsCdkDsl CfnTableOptimizer.Builder.() -> Unit = {}): CfnTableOptimizer = CfnTableOptimizer.Builder.create(this, id).apply(initializer).build()
