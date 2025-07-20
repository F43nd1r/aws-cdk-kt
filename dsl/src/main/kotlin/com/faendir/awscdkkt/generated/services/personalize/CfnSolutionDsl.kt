package com.faendir.awscdkkt.generated.services.personalize

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnSolution
import software.amazon.awscdk.services.personalize.CfnSolutionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSolution(
  id: String,
  props: CfnSolutionProps,
  initializer: @AwsCdkDsl CfnSolution.() -> Unit = {},
): CfnSolution = CfnSolution(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSolution(id: String, initializer: @AwsCdkDsl CfnSolution.Builder.() -> Unit = {}): CfnSolution = CfnSolution.Builder.create(this, id).apply(initializer).build()
