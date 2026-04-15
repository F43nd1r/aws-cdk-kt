package com.faendir.awscdkkt.generated.services.bcmpricingcalculator

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.bcmpricingcalculator.CfnBillScenario
import software.amazon.awscdk.services.bcmpricingcalculator.CfnBillScenarioProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBillScenario(id: String, initializer: @AwsCdkDsl CfnBillScenario.() -> Unit = {}): CfnBillScenario = CfnBillScenario(this, id).apply(initializer)

@Generated
public fun Construct.cfnBillScenario(
  id: String,
  props: CfnBillScenarioProps,
  initializer: @AwsCdkDsl CfnBillScenario.() -> Unit = {},
): CfnBillScenario = CfnBillScenario(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBillScenario(id: String, initializer: @AwsCdkDsl CfnBillScenario.Builder.() -> Unit = {}): CfnBillScenario = CfnBillScenario.Builder.create(this, id).apply(initializer).build()
