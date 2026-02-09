@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.cxapi.Environment

@Deprecated(message = "software.amazon.awscdk.cxapi.Environment is deprecated in CDK.")
@Generated
public fun buildEnvironment(initializer: @AwsCdkDsl Environment.Builder.() -> Unit = {}): Environment = Environment.Builder().apply(initializer).build()
