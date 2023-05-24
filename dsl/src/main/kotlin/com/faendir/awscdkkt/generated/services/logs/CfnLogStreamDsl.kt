package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnLogStream
import software.amazon.awscdk.services.logs.CfnLogStreamProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLogStream(id: String, props: CfnLogStreamProps): CfnLogStream =
    CfnLogStream(this, id, props)

@Generated
public fun Construct.cfnLogStream(
  id: String,
  props: CfnLogStreamProps,
  initializer: @AwsCdkDsl CfnLogStream.() -> Unit,
): CfnLogStream = CfnLogStream(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLogStream(id: String, initializer: @AwsCdkDsl
    CfnLogStream.Builder.() -> Unit): CfnLogStream = CfnLogStream.Builder.create(this,
    id).apply(initializer).build()
