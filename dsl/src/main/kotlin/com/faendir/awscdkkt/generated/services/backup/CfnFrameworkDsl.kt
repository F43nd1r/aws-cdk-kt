package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnFramework
import software.amazon.awscdk.services.backup.CfnFrameworkProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFramework(
  id: String,
  props: CfnFrameworkProps,
  initializer: @AwsCdkDsl CfnFramework.() -> Unit = {},
): CfnFramework = CfnFramework(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFramework(id: String, initializer: @AwsCdkDsl
    CfnFramework.Builder.() -> Unit = {}): CfnFramework = CfnFramework.Builder.create(this,
    id).apply(initializer).build()
