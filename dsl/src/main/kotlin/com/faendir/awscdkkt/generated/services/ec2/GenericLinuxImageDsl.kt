package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.ec2.GenericLinuxImage

@Generated
public fun buildGenericLinuxImage(amiMap: Map<String, String>, initializer: @AwsCdkDsl GenericLinuxImage.Builder.() -> Unit = {}): GenericLinuxImage = GenericLinuxImage.Builder.create(amiMap).apply(initializer).build()
