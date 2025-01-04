package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnAnycastIpList
import software.amazon.awscdk.services.cloudfront.CfnAnycastIpListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAnycastIpList(
  id: String,
  props: CfnAnycastIpListProps,
  initializer: @AwsCdkDsl CfnAnycastIpList.() -> Unit = {},
): CfnAnycastIpList = CfnAnycastIpList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAnycastIpList(id: String, initializer: @AwsCdkDsl
    CfnAnycastIpList.Builder.() -> Unit = {}): CfnAnycastIpList =
    CfnAnycastIpList.Builder.create(this, id).apply(initializer).build()
