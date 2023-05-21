package com.faendir.awscdkkt.services.logs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnLogStreamProps

@Generated
public fun cfnLogStreamProps(initializer: CfnLogStreamProps.Builder.() -> Unit = {}):
    CfnLogStreamProps = CfnLogStreamProps.builder().apply(initializer).build()
