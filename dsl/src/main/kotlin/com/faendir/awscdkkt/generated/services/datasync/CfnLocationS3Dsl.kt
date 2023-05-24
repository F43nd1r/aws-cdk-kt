package com.faendir.awscdkkt.generated.services.datasync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationS3
import software.amazon.awscdk.services.datasync.CfnLocationS3Props
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationS3(id: String, props: CfnLocationS3Props): CfnLocationS3 =
    CfnLocationS3(this, id, props)

@Generated
public fun Construct.cfnLocationS3(
  id: String,
  props: CfnLocationS3Props,
  initializer: @AwsCdkDsl CfnLocationS3.() -> Unit,
): CfnLocationS3 = CfnLocationS3(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLocationS3(id: String, initializer: @AwsCdkDsl
    CfnLocationS3.Builder.() -> Unit): CfnLocationS3 = CfnLocationS3.Builder.create(this,
    id).apply(initializer).build()
