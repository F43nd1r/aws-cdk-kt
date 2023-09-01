package com.faendir.awscdkkt.generated.services.frauddetector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnOutcome
import software.amazon.awscdk.services.frauddetector.CfnOutcomeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnOutcome(
  id: String,
  props: CfnOutcomeProps,
  initializer: @AwsCdkDsl CfnOutcome.() -> Unit = {},
): CfnOutcome = CfnOutcome(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnOutcome(id: String, initializer: @AwsCdkDsl
    CfnOutcome.Builder.() -> Unit = {}): CfnOutcome = CfnOutcome.Builder.create(this,
    id).apply(initializer).build()
