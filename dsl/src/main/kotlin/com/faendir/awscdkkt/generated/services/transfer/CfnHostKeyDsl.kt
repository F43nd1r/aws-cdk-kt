package com.faendir.awscdkkt.generated.services.transfer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.transfer.CfnHostKey
import software.amazon.awscdk.services.transfer.CfnHostKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHostKey(
  id: String,
  props: CfnHostKeyProps,
  initializer: @AwsCdkDsl CfnHostKey.() -> Unit = {},
): CfnHostKey = CfnHostKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnHostKey(id: String, initializer: @AwsCdkDsl CfnHostKey.Builder.() -> Unit = {}): CfnHostKey = CfnHostKey.Builder.create(this, id).apply(initializer).build()
