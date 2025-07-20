package com.faendir.awscdkkt.generated.services.aps

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace
import software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRuleGroupsNamespace(
  id: String,
  props: CfnRuleGroupsNamespaceProps,
  initializer: @AwsCdkDsl CfnRuleGroupsNamespace.() -> Unit = {},
): CfnRuleGroupsNamespace = CfnRuleGroupsNamespace(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRuleGroupsNamespace(id: String, initializer: @AwsCdkDsl CfnRuleGroupsNamespace.Builder.() -> Unit = {}): CfnRuleGroupsNamespace = CfnRuleGroupsNamespace.Builder.create(this, id).apply(initializer).build()
