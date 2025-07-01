package com.faendir.awscdkkt.generated.services.aiops

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.aiops.CfnInvestigationGroup
import software.amazon.awscdk.services.aiops.CfnInvestigationGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInvestigationGroup(
  id: String,
  props: CfnInvestigationGroupProps,
  initializer: @AwsCdkDsl CfnInvestigationGroup.() -> Unit = {},
): CfnInvestigationGroup = CfnInvestigationGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnInvestigationGroup(id: String, initializer: @AwsCdkDsl
    CfnInvestigationGroup.Builder.() -> Unit = {}): CfnInvestigationGroup =
    CfnInvestigationGroup.Builder.create(this, id).apply(initializer).build()
