package com.faendir.awscdkkt.generated.services.elasticbeanstalk

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationVersion(
  id: String,
  props: CfnApplicationVersionProps,
  initializer: @AwsCdkDsl CfnApplicationVersion.() -> Unit = {},
): CfnApplicationVersion = CfnApplicationVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationVersion(id: String, initializer: @AwsCdkDsl CfnApplicationVersion.Builder.() -> Unit = {}): CfnApplicationVersion = CfnApplicationVersion.Builder.create(this, id).apply(initializer).build()
