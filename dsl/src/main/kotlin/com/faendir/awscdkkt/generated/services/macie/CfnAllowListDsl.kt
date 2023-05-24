package com.faendir.awscdkkt.generated.services.macie

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnAllowListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAllowList(id: String, props: CfnAllowListProps): CfnAllowList =
    CfnAllowList(this, id, props)

@Generated
public fun Construct.cfnAllowList(
  id: String,
  props: CfnAllowListProps,
  initializer: @AwsCdkDsl CfnAllowList.() -> Unit,
): CfnAllowList = CfnAllowList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAllowList(id: String, initializer: @AwsCdkDsl
    CfnAllowList.Builder.() -> Unit): CfnAllowList = CfnAllowList.Builder.create(this,
    id).apply(initializer).build()
