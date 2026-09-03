package com.faendir.awscdkkt.generated.services.cloudformation

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudformation.CfnChangeSet
import software.amazon.awscdk.services.cloudformation.CfnChangeSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnChangeSet(
  id: String,
  props: CfnChangeSetProps,
  initializer: @AwsCdkDsl CfnChangeSet.() -> Unit = {},
): CfnChangeSet = CfnChangeSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnChangeSet(id: String, initializer: @AwsCdkDsl CfnChangeSet.Builder.() -> Unit = {}): CfnChangeSet = CfnChangeSet.Builder.create(this, id).apply(initializer).build()
