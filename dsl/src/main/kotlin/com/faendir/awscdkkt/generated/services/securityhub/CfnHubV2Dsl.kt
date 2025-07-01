package com.faendir.awscdkkt.generated.services.securityhub

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securityhub.CfnHubV2
import software.amazon.awscdk.services.securityhub.CfnHubV2Props
import software.constructs.Construct

@Generated
public fun Construct.cfnHubV2(id: String, initializer: @AwsCdkDsl CfnHubV2.() -> Unit = {}):
    CfnHubV2 = CfnHubV2(this, id).apply(initializer)

@Generated
public fun Construct.cfnHubV2(
  id: String,
  props: CfnHubV2Props,
  initializer: @AwsCdkDsl CfnHubV2.() -> Unit = {},
): CfnHubV2 = CfnHubV2(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHubV2(id: String, initializer: @AwsCdkDsl CfnHubV2.Builder.() -> Unit =
    {}): CfnHubV2 = CfnHubV2.Builder.create(this, id).apply(initializer).build()
