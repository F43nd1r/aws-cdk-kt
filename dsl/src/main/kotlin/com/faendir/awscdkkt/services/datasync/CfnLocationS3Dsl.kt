package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationS3
import software.amazon.awscdk.services.datasync.CfnLocationS3Props
import software.constructs.Construct

@Generated
public fun Construct.cfnLocationS3(
  id: String,
  props: CfnLocationS3Props,
  initializer: CfnLocationS3.() -> Unit = {},
): CfnLocationS3 = CfnLocationS3(this, id, props).apply(initializer)
